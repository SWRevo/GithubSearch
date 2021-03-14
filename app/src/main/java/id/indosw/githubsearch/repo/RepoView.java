package id.indosw.githubsearch.repo;

import java.util.List;
import id.indosw.gitreposearch.api.models.Owner;

public interface RepoView {

    void attachContributors(List<Owner> contributorList);

    void changeMessage(String message);

}
