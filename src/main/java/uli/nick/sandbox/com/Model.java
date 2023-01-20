package uli.nick.sandbox.com;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private static final int FIELD_WIDTH = 4;

    private Tile[][] gameTiles;

    protected int score;

    protected int maxTile;

    public Model() {
        resetGameTiles();
    }

    private void addTile() {
        List<Tile> emptyTiles = getEmptyTiles();
        if (emptyTiles.isEmpty()) return;
        int index = (int) (Math.random() * getEmptyTiles().size());
        Tile emptyTile = emptyTiles.get(index);
        emptyTile.value = Math.random() < 0.9 ? 2 : 4;
    }

    private List<Tile> getEmptyTiles() {
        List<Tile> emptyTiles = new ArrayList<>();
        for (Tile[] gameTile : gameTiles) {
            for (Tile tile : gameTile) {
                if (tile.isEmpty()) {
                    emptyTiles.add(tile);
                }
            }
        }
        return emptyTiles;
    }

    void resetGameTiles() {
        gameTiles = new Tile[FIELD_WIDTH][FIELD_WIDTH];
        for (int i = 0; i < gameTiles.length; i++) {
            for (int j = 0; j < gameTiles[i].length; j++) {
                gameTiles[i][j] = new Tile();
            }
        }
        addTile();
        addTile();
        score = 0;
        maxTile = 0;
    }

    private void mergeTiles(Tile[] tiles) {
        for (int i = 0; i < tiles.length - 1; i++) {
            if (tiles[i].value == tiles[i + 1].value) {
                tiles[i].value *= 2;
                tiles[i + 1].value = 0;
                i++;
            }
        }
        for (Tile tile : tiles) {
            if (tile.value > maxTile) {
                maxTile = tile.value;
                score += maxTile;
            }
        }
    }

    private void compressTiles(Tile[] tiles) {
        for (int i = 0; i < tiles.length; i++) {
            if (tiles[i].value == 0 && i != tiles.length - 1) {
                for (int j = i + 1; j < tiles.length; j++) {
                    tiles[j - 1].value = tiles[j].value;
                }
                tiles[tiles.length - 1].value = 0;
            }
        }
    }
}
