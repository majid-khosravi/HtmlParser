package com.htmlparser.extractor

import org.jsoup.nodes.Element


class IFrameExtractor(val element: Element) : Extractor<String>(element) {
    override fun extract(): String {
        return element.attr("abs:src")
    }
}