package com.whizzy.rentcloud.configconsumer;


import com.whizzy.rentcloud.configconsumer.model.MemberProfileConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

    @Autowired
    private MemberProfileConfiguration memberProfileConfiguration;

    @RequestMapping("/profile")
    public MemberProfileConfiguration getConfig(Model model){
        return memberProfileConfiguration;
//        model.addAttribute("model",memberProfileConfiguration.getDefaultModel());
//        model.addAttribute("min",memberProfileConfiguration.getMinRentPeriod());
//        return "mprofile";
    }

}
