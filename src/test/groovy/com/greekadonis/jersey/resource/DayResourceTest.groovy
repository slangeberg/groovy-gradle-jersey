package com.greekadonis.jersey.resource

import org.junit.Before
import org.junit.Test


class DayResourceTest {
    DayResource dayResource

    @Before void setup() {
        dayResource = new DayResource()
    }
    @Test
    void findAll() {
        assert dayResource.findAll().size() == 3
    }
    @Test
    void findAllDays() {
        assert dayResource.findAllDays().size() == 3
    }
}
