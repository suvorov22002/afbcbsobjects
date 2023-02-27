package com.afriland.cbsobjects.responses.cbs.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GroupAndJob {
    public CustomersGroup customersGroup;
    public Subgroup subgroup;
    public Job job;
    public Subjob subjob;
}
