package com.edigest.journalApp.controller;


import com.edigest.journalApp.entity.JournalEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {

    private Map<Long, JournalEntity> je = new HashMap<>();

    @GetMapping
    public List<JournalEntity> getAll() {
        return new ArrayList<>(je.values());
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntity myEntry) {
        je.put(myEntry.getId(), myEntry);
        return true;
    }
}