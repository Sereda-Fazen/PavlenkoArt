package tests;

import utils.Application;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Story;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.pages.Pages;
import net.thucydides.junit.annotations.Concurrent;
import net.thucydides.junit.runners.ThucydidesRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

@Story(Application.RozCompare.Compare.class)
@RunWith(ThucydidesRunner.class)
@Concurrent(threads = "1")
public class VideoCompareTest extends BeforeClass {
    @ManagedPages(defaultUrl = "http://pavlenko-art.test-lemon.com")
    public Pages pages;

    @WithTag("compare_two_cards")
    @Test
    public void compareTwoCards() throws InterruptedException {
        compare.addMore();
        compare1.addGood();
        compare2.addOrder();
        //form
        name.addName();
        email.addEmail();
        phone.addPhone();
        city.addCity();
        adress.addAdress();
        comment.addComment();
        orderbue.addOrderBuy();

        Thread.sleep(5000);
    }
    }

