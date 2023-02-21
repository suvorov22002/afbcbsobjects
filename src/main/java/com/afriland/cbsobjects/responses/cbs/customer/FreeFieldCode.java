package com.afriland.cbsobjects.responses.cbs.customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public abstract class FreeFieldCode {
    public String code;
    public String designation;
}
