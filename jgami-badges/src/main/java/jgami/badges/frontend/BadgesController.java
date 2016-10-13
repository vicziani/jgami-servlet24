package jgami.badges.frontend;

import jgami.badges.backend.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class BadgesController {

    private BadgeService badgeService;

    @Autowired
    public BadgesController(BadgeService badgeService) {
        this.badgeService= badgeService;
    }

    @InitBinder("badgeRequestForm")
    public void initBinder(WebDataBinder binder) {
        binder.addValidators(new BadgeRequestFormValidator());
    }

    @RequestMapping(value = "/badges", method = RequestMethod.GET)
    public ModelAndView listBadges() {
        return new ModelAndView("badges")
                .addObject("badges", badgeService.listBadgeRequests());
    }


    @RequestMapping(value = "/badges/request", method = RequestMethod.GET)
    public ModelAndView requestBadge() {
        return new ModelAndView("requestBadge")
                .addObject("badgeRequestForm", new BadgeRequestForm())
                .addObject("courses", badgeService.listCourses());
    }

    @RequestMapping(value = "/badges/request", method = RequestMethod.POST)
    public ModelAndView requestBadgePost(
            @Validated BadgeRequestForm badgeRequestForm, BindingResult bindingResult,
            RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            return new ModelAndView("requestBadge")
                    .addObject("courses", badgeService.listCourses());
        }

        badgeService.requestBadge(new BadgeRequestFormConverter().convert(badgeRequestForm));
        redirectAttributes.addFlashAttribute("message", "badges.message.success.request");
        return new ModelAndView("redirect:/badges");
    }
}
