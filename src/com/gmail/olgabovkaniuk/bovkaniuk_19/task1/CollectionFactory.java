package com.gmail.olgabovkaniuk.bovkaniuk_19.task1;

public class CollectionFactory {

    public CollectionService getCollection(ListEnum listEnum) {
        switch (listEnum) {
            case ARRAY_LIST:
                return new ArrayListService();
            case LINKED_LIST:
                return new LinkedListService();
        }
        throw new RuntimeException("Not supported value of enum:" + listEnum);
    }
}
