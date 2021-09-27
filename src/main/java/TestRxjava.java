import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.*;
import io.reactivex.rxjava3.functions.Consumer;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;


public class TestRxjava {
    private int i = 0;
    @Test
    public void Fun() {
        List<String> list = Arrays.asList("111","222");
        String [] items = new String[]{"222","333"};
//        Observable.just(1, 2, 3, 4).subscribe(new Consumer<Integer>() {
//            public void accept(Integer integer) throws Throwable {
//                System.out.println("aaa"+integer);
//            }
//        });
        Observable.just("222","333").count().subscribe(new Consumer<Long>() {
            public void accept(Long aLong) throws Throwable {
                System.out.println(aLong);
            }
        });
//        Observable.fromArray(list).subscribe(new Consumer<List<String>>() {
//            public void accept(List<String> strings) throws Throwable {
//                System.out.println();
//            }
//        });
        /*Observable.just(list, list).subscribe(new Consumer<List<String>>() {
            public void accept(List<String> strings) throws Throwable {

            }
        });*/



//        Single<Long> s = Observable.just("111","222").count();
//
//        s.subscribe(new Consumer<Long>() {
//            public void accept(Long aLong) throws Throwable {
//                System.out.println(aLong);
//            }
//        });
//        Observable.interval(1, TimeUnit.SECONDS)
//                .subscribe(new Consumer<Long>() {
//                    public void accept(Long aLong) throws Throwable {
//                        System.out.println("ddddd");
//                    }
//                });
//
//
//            Thread.sleep(2000);

//        Observable.range(40, 100).subscribe(new Consumer<Integer>() {
//            public void accept(Integer integer) throws Throwable {
//                System.out.println(integer);
//            }
//        });
//


//        Observable.interval(3, TimeUnit.SECONDS).subscribe(new Consumer<Long>() {
//            public void accept(Long aLong) throws Throwable {
//                System.out.println("222");
//            }
//        });
//        try {
//            Thread.sleep(20000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

         /*Observable.fromArray(items).subscribe(new Consumer<Integer>() {
            public void accept(Integer integer) throws Throwable {
                System.out.println(integer+1);
            }
        });*/

        /*Observable.defer(new Supplier<ObservableSource<String>>() {
            public ObservableSource<String> get() throws Throwable {
                return Observable.just("1","2","3","4");
            }
        }).subscribe(new Consumer<String>() {
            public void accept(String s) throws Throwable {
                System.out.println(s+"666");
            }
        });*/
      /*  Observable.create(new ObservableOnSubscribe<String>() {

            public void subscribe(@NonNull ObservableEmitter<String> emitter) throws Throwable {
                emitter.onNext("1");
                emitter.onNext("2");
            }
        }).subscribe(new Consumer<String>() {
            public void accept(String s) throws Throwable {
                System.out.println(s+"6666");
            }
        });*/

    }
}
