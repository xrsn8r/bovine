package us.xrsn8r.bovine

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import us.xrsn8r.bovine.ui.AlbumGridScreen
import us.xrsn8r.bovine.ui.NowPlayingBar

@Composable
fun BovineApp() {
    Scaffold(
        bottomBar = {
            NowPlayingBar(
                onSwipeUp = { /* open full now playing */ }
            )
        }
    ) { padding ->
        Box(modifier = Modifier.padding(padding).fillMaxSize()) {
            AlbumGridScreen()
        }
    }
}
