package com.example.firstproject.dto;

import com.example.firstproject.entity.Coffee;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CoffeeForm {
    private Long id;
    private String name;
    private String price;

    public Coffee toEntity() {
        return new Coffee(this.id, this.name, this.price);
    }
}
