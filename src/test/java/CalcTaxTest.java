import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class CalcTaxTest {

    @DisplayName("Тест рассчета налога 6 %")
    @ParameterizedTest
    @ValueSource(doubles = {10})
    void taxEarning(double earnings) {
        Assertions.assertEquals(0.6, CalcTax.taxEarning(earnings));
    }

    @DisplayName("Тест рассчета Доходи-Рассходы 15%")
    @ParameterizedTest
    @CsvSource({
            "100, 0"
    })
    void taxEarningMinusSpendings(double earnings, double spendings) {
        Assertions.assertEquals(15, CalcTax.taxEarningMinusSpendings(earnings, spendings));
    }

    @DisplayName("Тест рассчета разницы в налоговых системах")
    @ParameterizedTest
    @CsvSource({
            "0.6, 15"
    })
    void different(double taxEarn, double taxEmS) {
        Assertions.assertEquals(14.4, CalcTax.different(taxEarn, taxEmS));
    }
}
