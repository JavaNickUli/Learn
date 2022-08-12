package uli.nick.job4j.praxis.tasks116array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

class CinemaTest {

    @Test
    public void checkEmptyPlace() {
        char[][] places = {
                {'O', 'O', 'X'},
                {'O', 'X', 'X'},
                {'X', 'X', 'X'}
        };

        int[] rsl = Cinema.checkEmptyPlace(places);
        int[] expected = new int[]{0, 0};

        then(rsl).isEqualTo(expected);
    }

    @Test
    public void checkEmptyPlaceIsNotNull() {
        char[][] places = {
                {'X', 'O', 'X', 'O', 'X'},
                {'O', 'X', 'O', 'X', 'O'},
                {'X', 'O', 'O', 'O', 'X'},
                {'O', 'X', 'O', 'X', 'O'},
                {'X', 'X', 'X', 'O', 'O'}
        };

        int[] rsl = Cinema.checkEmptyPlace(places);
        int[] expected = new int[]{2, 2};

        then(rsl).isEqualTo(expected);
    }

    @Test
    public void checkEmptyPlaceIsNull() {
        char[][] places = {
                {'X', 'O', 'X', 'O', 'X'},
                {'O', 'X', 'O', 'X', 'O'},
                {'X', 'O', 'X', 'O', 'X'},
                {'O', 'X', 'O', 'X', 'O'},
                {'X', 'X', 'X', 'O', 'X'}
        };

        int[] rsl = Cinema.checkEmptyPlace(places);
        int[] expected = new int[]{};

        then(rsl).isEqualTo(expected);
    }
}
