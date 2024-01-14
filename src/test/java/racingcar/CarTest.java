package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.domain.Car;


import static org.assertj.core.api.Assertions.*;


class CarTest {
    private Car car1 = new Car("pobi");

    @Test
    @DisplayName("자동차 객체 - 이름 반환")
    void getCar_name() {
    }

    @Test
    @DisplayName("자동차 객체 - 이동거리 반환")
    void getDistance() {
        assertThat(car1.getDistance()).isEqualTo(0);
    }

    @Test
    @DisplayName("자동차 객체 - 이동 메서드")
    void move() {
        assertThat(car1.getDistance() == 0 || car1.getDistance() == 1).isTrue();
    }
}