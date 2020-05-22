package cn.junit.test;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

class AddTest {

    @Test
    void add() {
        int z = new Add().add(5,3);
        assertThat(z,is(8));
    }

    @Test
    void main() {
    }
}