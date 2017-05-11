package pom.lekar.newsindia;

import pom.lekar.newsindia.models.NewsList;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by lekar on 26.04.17.
 */

public interface ApiServise {
    @GET(Config.URL_NEWS_DEFAULT_FEED)
    Observable<NewsList> serch(
            @Query(Config.PARAM_FEED_TYPE) String key);
}
