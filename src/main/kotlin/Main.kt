package org.example

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element
import org.jsoup.select.Elements

fun main() {

    val doc: Document = Jsoup.connect("https://mybook.ru/author/duglas-adams/avtostopom-po-galaktike-restoran-u-konca-vselennoj/citations/").get()
    println(doc.title())

    // #Welcome_to_Wikipedia
    // .class
    // div
    // a - ссылки


    val newsHeadlines: Elements = doc.select("#mp-itn b a")
    println(newsHeadlines)

    for (headLine: Element in newsHeadlines) {
        println("${headLine.attr("title")}\n\t${headLine.absUrl("href")}")
    }
}
/*
Document doc = Jsoup.connect("https://en.wikipedia.org/").get();
log(doc.title());
Elements newsHeadlines = doc.select("#mp-itn b a");
for (Element headline : newsHeadlines) {
    log("%s\n\t%s",
        headline.attr("title"), headline.absUrl("href"));
}
 */