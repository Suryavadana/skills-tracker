package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping(value="")
    @ResponseBody
    public String main() {
        return " <h1>Skills Tracker</h1>\n" +
                "    <h2>We have a few skills we would like to learn. Here is the list!</h2>\n" +
                "    <ol>\n" +
                "        <li>Java</li>\n" +
                "        <li>JavaScript</li>\n" +
                "        <li>Python</li>\n" +
                "    </ol>";
    }
    //localhost:8080/form?nameInput=test
        @GetMapping(value="form")
        @ResponseBody
        public String Form(){
            return " <form method=\"post\">\n" +
                    "        Name:<input type=\"text\" name=\"nameInput\"><br>\n" +
                    "        My favorite language:  <select name=\"Skills1\" id=\"Skills1\">\n" +
                    "        <option value=\"Java\">Java</option>\n" +
                    "        <option value=\"JavaScript\">JavaScript</option>\n" +
                    "        <option value=\"Python\">Python</option>\n" +
                    "        </select><br>\n" +
                    "        My Second favorite language:  <select name=\"Skills2\" id=\"Skills2\">\n" +
                    "        <option value=\"Java\">Java</option>\n" +
                    "        <option value=\"JavaScript\">JavaScript</option>\n" +
                    "        <option value=\"Python\">Python</option>\n" +
                    "    </select><br>\n" +
                    "        My third favorite language:  <select name=\"Skills3\" id=\"Skills3\">\n" +
                    "        <option value=\"Java\">Java</option>\n" +
                    "        <option value=\"JavaScript\">JavaScript</option>\n" +
                    "        <option value=\"Python\">Python</option>\n" +
                    "    </select><br>\n" +
                    "        <input type=\"submit\" value=\"Submit\">\n" +
                    "    </form>";

        }
        @PostMapping(value="form")
        @ResponseBody
    public String responseForm(@RequestParam String nameInput,
                               @RequestParam(name = "Skills1") String firstSkill,
                               @RequestParam(name = "Skills2") String secondSkill,
                               @RequestParam(name = "Skills3") String thirdSkill) {
        return  "<h1>" + nameInput + "</h1>" +
                "<p>First favorite skill: " + firstSkill + "</p>" +
                "<p>Second favorite skill: " + secondSkill + "</p>" +
                "<p>Third favorite Skill: " + thirdSkill + "</p>"
               ;
    }




}
