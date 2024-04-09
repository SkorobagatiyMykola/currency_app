package ua.skorobahatyi.currency_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ua.skorobahatyi.currency_app.entity.Currency;
import ua.skorobahatyi.currency_app.entity.dto.CurrencyDto;

import java.util.List;

@Repository
public interface CurrencyRepository extends JpaRepository<Currency, Integer> {

    @Query("SELECT new ua.skorobahatyi.currency_app.entity.dto.CurrencyDto(c.r030, c.code, c.name)" +
            "FROM currencies AS c" )
    List<CurrencyDto> findTotalCurrenciesDto();
}
