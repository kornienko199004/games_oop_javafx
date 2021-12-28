package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;
import ru.job4j.chess.firuges.black.BishopBlack;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class BishopBlackTest {
    @Test
    public void checkStartPosition() {
        Cell position = Cell.C1;
        Figure bishopBlack = new BishopBlack(position);
        assertThat(bishopBlack.position(), is(Cell.C1));
    }

    @Test
    public void checkCopyPosition() {
        Cell startPosition = Cell.C1;
        Figure bishopBlack = new BishopBlack(startPosition);

        Cell endPosition = Cell.C2;
        bishopBlack = bishopBlack.copy(endPosition);
        assertThat(bishopBlack.position(), is(endPosition));
    }

    @Test
    public void checkWayCells() {
        Cell startPosition = Cell.C1;
        Figure bishopBlack = new BishopBlack(startPosition);
        Cell[] wayCells = bishopBlack.way(Cell.G5);

        Cell[] expectedWayCells = { Cell.D2, Cell.E3, Cell.F4, Cell.G5 };
        assertThat(wayCells, is(expectedWayCells));
    }

    @Test
    public void checkWayCellsC1G5() {
        Cell startPosition = Cell.C1;
        Figure bishopBlack = new BishopBlack(startPosition);
        Cell[] wayCells = bishopBlack.way(Cell.G5);

        Cell[] expectedWayCells = { Cell.D2, Cell.E3, Cell.F4, Cell.G5 };
        assertThat(wayCells, is(expectedWayCells));
    }

    @Test
    public void checkWayCellsA1H8() {
        Cell startPosition = Cell.A1;
        Figure bishopBlack = new BishopBlack(startPosition);
        Cell[] wayCells = bishopBlack.way(Cell.H8);

        Cell[] expectedWayCells = { Cell.B2, Cell.C3, Cell.D4, Cell.E5, Cell.F6, Cell.G7, Cell.H8 };
        assertThat(wayCells, is(expectedWayCells));
    }

    @Test
    (expected = ImpossibleMoveException.class)
    public void checkWayCellsA1H7() {
        Cell startPosition = Cell.A1;
        Figure bishopBlack = new BishopBlack(startPosition);
        Cell[] wayCells = bishopBlack.way(Cell.H7);
    }
}