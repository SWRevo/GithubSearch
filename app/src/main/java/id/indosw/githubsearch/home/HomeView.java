package id.indosw.githubsearch.home;

import java.util.List;

import id.indosw.gitreposearch.api.models.Item;

public interface HomeView {

    void changeMessage(String message);

    void showMessage();

    void hideMessage();

    void updateList(List<Item> items);

    void clearList();

    void showList();

    void hideList();

    void resetFilters();
}
