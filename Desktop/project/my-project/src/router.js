import { createWebHistory, createRouter } from "vue-router";
import add from "./components/add.vue";
import edit from "./components/edit.vue";
import delt from "./components/delt.vue";
import list from "./components/list.vue";
import mn from "./components/mn.vue";
import preview from "./components/preview.vue";
import listSinglePage from "./components/listSinglePage.vue"
import listMultiplePages from "./components/listMultiplePages.vue"

const routes = 
 [{ path: "/mn", 
 component: mn,
 name: mn
},
  { path: "/add", 
  component: add,
  name: add
},
  { path: '/delt',
   component: delt,
   name: delt
},
{ path: "/edit", 
component: edit,
name: edit
},
{ path: "/list", 
  component: list,
  name: list,children: [
    {
      path: 'single',
      component: listSinglePage,
    },
    {
      path: 'multiple',
      component: listMultiplePages,
    },
  ]
  },
{ path: "/preview", 
  component: preview,
  name: preview
},
];
const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes,
});
export default router;
 
