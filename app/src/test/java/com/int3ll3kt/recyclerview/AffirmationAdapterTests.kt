package com.int3ll3kt.recyclerview

import android.content.Context
import com.int3ll3kt.recyclerview.adapter.ItemAdapter
import com.int3ll3kt.recyclerview.model.Affirmation
import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.mock

class AffirmationAdapterTests {
    private val context = mock(Context::class.java)
    @Test
    fun adapter_size(){

        val data = listOf(Affirmation(R.string.affirmation1, R.drawable.image1),
        Affirmation(R.string.affirmation2, R.drawable.image2)
        )

        val adapter = ItemAdapter(context, data)
        assertEquals("ItemAdapter is not the correct size", data.size, adapter.itemCount)

    }
}