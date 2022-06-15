import { DefaultApolloClient } from '@vue/apollo-composable'
import './index.css'
import { apolloClient } from './appollo.js'
import { createApp, provide, h } from 'vue'
import App from './App.vue'
import router from './router.js'
const app = createApp({
  setup () {
    provide(DefaultApolloClient, apolloClient)
  },

  render: () => h(App),
})
app.use(router)
app.mount('#app');
