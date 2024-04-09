package ua.skorobahatyi.currency_app.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Data
@Entity(name = "currencies")
@NoArgsConstructor
@AllArgsConstructor
public class Currency {
    @Id
    private Integer id;
    @Column(nullable = false)
    private Integer r030;
    @Column(nullable = false)
    private String code;

    @Column(nullable = false)
    private String name;
    @Column(columnDefinition = "timestamp default current_timestamp")
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "currency")
    private Set<CurrencyRate> rates;
}
