package com.kheilyk.api.controllers;

import com.kheilyk.api.models.Template;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Maksym Kheilyk
 */
@Controller
@RequestMapping(value = "/template")
public class TempController {

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public Template post(@RequestBody Template template) {
        return template;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Template get(@PathVariable String id) {
        Template template = new Template();
        template.setId(id);
        return template;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public Map<String, String> put(@PathVariable String id, @RequestBody Template template) {
        Map<String, String> map = new HashMap<>();
        map.put("example", template.getId());
        return map;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public Map<String, String> delete(@PathVariable String id) {
        Map<String, String> map = new HashMap<>();
        map.put("example", id);
        return map;
    }
}