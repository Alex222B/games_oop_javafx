package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;

import org.junit.Assert;
import ru.job4j.chess.firuges.Figure;
import static org.junit.Assert.assertThat;

public class BishopBlackTest {

    @Test
    public void positionWhenC8ThenC8() {
        Cell expected = Cell.C8;
        Figure bishopBlack = new BishopBlack(expected);
        Cell out  = bishopBlack.position();
        Assert.assertEquals(expected, out);
    }

    @Test
    public void wayWhenC1G5ThenD2E3F4G5() {
        Figure bishopBlack = new BishopBlack(Cell.C1);
        Cell[] result = bishopBlack.way(Cell.G5);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test(expected = ImpossibleMoveException.class)
    public void wayWhenC1C5() {
        Figure bishopBlack = new BishopBlack(Cell.C1);
        bishopBlack.way(Cell.C5);
    }

    @Test
    public void copy() {
        Cell expected = Cell.D6;
        Figure bishopBlack = new BishopBlack(Cell.C8);
        Figure newbishopBlack = bishopBlack.copy(expected);
        Cell out  = newbishopBlack.position();
        Assert.assertEquals(expected, out);
    }
}