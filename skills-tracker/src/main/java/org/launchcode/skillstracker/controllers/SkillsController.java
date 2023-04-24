package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



@Controller()

public class SkillsController {

    @GetMapping("")
    @ResponseBody
    public String skills() {
        return "<html>" +
                "<h1>Skills Controller</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Python</>" +
                "</html>";

    }


    @GetMapping("form")
    @ResponseBody
    public String form() {
        return  "<form method='post' action='form'>" +
                "<html>" +
                "<label>Name:</label><br>" +
                "<input type='text' ><br>" +

                "<label>My favorite language:</label><br>" +
                "<select>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select><br>" +

                "<label>My second favorite language:</label><br>" +
                "<select>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select><br>" +

                "<label>My third favorite language:</label><br>" +
                "<select>" +
                "<option value='java'>Java</option>" +
                "<option value='javascript'>JavaScript</option>" +
                "<option value='python'>Python</option>" +
                "</select><br>" +

                "<button type='submit'>Submit</button>";
    }

    @PostMapping("form")
    @ResponseBody
    public String formResponse(@RequestParam String name, @RequestParam String firstFavorite,
                               @RequestParam String secondFavorite, @RequestParam String thirdFavorite) {
        return
                "<h1>" + name + "<h2>" +
                        "<ol>" +
                            "<li>" + firstFavorite + "</li>" +
                            "<li>" + secondFavorite + "</li>" +
                            "<li>" + thirdFavorite + "</li>" +
                        "</ol>";
    }




//    @GetMapping("table")
//    @ResponseBody
//    public String table() {
//        return "<html>" +
//                "<label>Name:</label><br>" +
//                "<input type='text' ><br>" +
//
//                "<table>" +
//                    "<tr>" +
//                        "<th>My favorite language:</th>" +
//                    "</tr>" +
//                    "<tr>" +
//
//                "<option value='java'>Java</option>" +
//                "<option value='javascript'>JavaScript</option>" +
//                "<option value='python'>Python</option>" +
//                "</select><br>" +
//
//                "<label>My second favorite language:</label><br>" +
//                "<select>" +
//                "<option value='java'>Java</option>" +
//                "<option value='javascript'>JavaScript</option>" +
//                "<option value='python'>Python</option>" +
//                "</select><br>" +
//
//                "<label>My third favorite language:</label><br>" +
//                "<select>" +
//                "<option value='java'>Java</option>" +
//                "<option value='javascript'>JavaScript</option>" +
//                "<option value='python'>Python</option>" +
//                "</select><br>" +
//
//                "<button type='submit'>Submit</button>";
//    }









}
