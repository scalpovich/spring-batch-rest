package com.github.chrisgleissner.springbatchrest.api.job;

import lombok.AllArgsConstructor;
import lombok.Value;
import org.springframework.hateoas.RepresentationModel;

@Value
@AllArgsConstructor
public class Job extends RepresentationModel<Job> {
    private String name;
}
