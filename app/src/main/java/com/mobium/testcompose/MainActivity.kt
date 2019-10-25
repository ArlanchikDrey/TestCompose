package com.mobium.testcompose

import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.Composable
import androidx.compose.unaryPlus
import androidx.ui.core.Text
import androidx.ui.core.dp
import androidx.ui.core.setContent
import androidx.ui.foundation.DrawImage
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.graphics.Image
import androidx.ui.graphics.imageFromResource
import androidx.ui.layout.Column
import androidx.ui.layout.Container
import androidx.ui.layout.Spacing
import androidx.ui.material.MaterialTheme
import androidx.ui.material.surface.Card
import androidx.ui.material.themeTextStyle
import androidx.ui.res.imageResource
import androidx.ui.tooling.preview.Preview

data class Photo(val title: String, val description: String)
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
            }
        }
    }
}

@Composable
fun PhotoCard(photo: Photo) {
    Card(shape = RoundedCornerShape(24.dp)) {
        Column {
            Container(expanded = true, height = 20.dp) {
            }
            Column(Spacing(16.dp)) {
                Text(photo.title, style = +themeTextStyle { h6 })
                Text(text = photo.description)
            }
        }
    }
}

@Preview
@Composable
fun show(){
    PhotoCard(Photo("Andrey","I'm from Russia"))
}
@Preview
@Composable
fun showA(){
    PhotoCard(Photo("Andrey","I'm from Russia"))
}
@Composable
fun PhotoList(photos: List<Photo>) {

    }
}



