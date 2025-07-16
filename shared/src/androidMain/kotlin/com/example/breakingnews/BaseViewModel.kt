package com.example.breakingnews

import androidx.lifecycle.Viewmodel
import androidx.lifecycle.viewModelScope

actual open class BaseViewModel: ViewModel() {

    actual val scope = viewModelScope
}