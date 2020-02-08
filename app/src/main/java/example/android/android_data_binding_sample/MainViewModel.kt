package example.android.android_data_binding_sample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    /**
     * シークバーの値を格納する
     * */
    private val _seekBarValue = MutableLiveData(50)

    /**
     * シークバーの値を表示用に整形した文字列
     * */
    val seekBarValueString: LiveData<String> = Transformations.map(_seekBarValue) {
        "value: $it"
    }

    /**
     * シークバーの値が変化した時に呼び出される
     * */
    fun onSeekBarValueChanged(value: Int) {
        _seekBarValue.postValue(value)
    }
}
