package ua.lviv.iot.first.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.first.dataaccess.GroupRepository;
import ua.lviv.iot.first.rest.model.Group;

import java.util.List;

@RequestMapping("/groups")
@RestController
public class GroupController {
    @Autowired
    private GroupRepository groupService;

    @GetMapping
    public List<Group> findAllGroups(){
        return groupService.findAll();
    }
}
