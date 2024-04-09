package ua.skorobahatyi.currency_app.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Data
@Entity(name = "dates")
public class DateDB {
    @Id
    private LocalDate dateId;

    @Column(nullable = false)
    private String status;

    @Column(nullable = false)
    private LocalDateTime updatedAt;
    @Column(nullable = false)
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "dateDB")
    private Set<CurrencyRate> rates;
}
