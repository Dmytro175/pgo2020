package Cw11;

import org.jetbrains.annotations.NotNull;

public class Item implements Comparable<Item> {
    private String id;
    private String name;

    public Item(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Item item) {
        if (id == getId()) {
            return 0;
        } else if (id > getId()) {
            return 1;
        } else {
            return -1;
        }
    }
}

