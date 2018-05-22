package com.target.dealbrowserpoc.dealbrowser.models

import com.nhaarman.mockito_kotlin.*
import com.target.dealbrowserpoc.dealbrowser.model.Response
import com.target.dealbrowserpoc.dealbrowser.network.ApiInterface
import com.target.dealbrowserpoc.dealbrowser.model.Data

import org.junit.Before
import org.junit.Test
import rx.Observable

import rx.schedulers.TestScheduler

class ProductListViewModelTest {

    lateinit var mViewModel: ProductListViewModel
    lateinit var testScheduler: TestScheduler
    lateinit var apiService: ApiInterface

    @Before
    @Throws(Exception::class)
    fun setUp() {
        testScheduler = TestScheduler()
    }

    @Test
    fun fetchDeals() {
        val response = Response("testId", mutableListOf(Data("id","","","","",1,"","","")),"testType")
        apiService = mock { on { getDeals() } doReturn Observable.just(response) }

        mViewModel = ProductListViewModel(testScheduler, testScheduler,apiService)

        mViewModel.fetchDeals()
        verify(apiService).getDeals()

    }
}