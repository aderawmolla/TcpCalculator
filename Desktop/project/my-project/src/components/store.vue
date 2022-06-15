<script setup>
import { ref } from "vue";
defineProps({
  msg: String,
});
const count = ref(0);
</script>

<template>
  <h1>{{ msg }}</h1>

  <p>
    Recommended IDE setup:
    <a href="https://code.visualstudio.com/" target="_blank">VS Code</a>
    +
    <a href="https://github.com/johnsoncodehk/volar" target="_blank">Volar</a>
  </p>

  <p>
    <a href="https://vitejs.dev/guide/features.html" target="_blank">
      Vite Documentation
    </a>
    |
    <a href="https://v3.vuejs.org/" target="_blank">Vue 3 Documentation</a>
  </p>

  <button type="button" @click="count++">count is: {{ count }}</button>
  <p>
    Edit
    <code>components/HelloWorld.vue</code> to test hot module replacement.
  </p>
</template>

<style scoped>
a {
  color: #42b983;
}
</style>
<template>
// <router-view></router-view>
//   <aside class="w-64" aria-label="Sidebar">
//         <div class="overflow-y-auto py-4 px-3 bg-gray-50 rounded dark:bg-gray-800">
//            <ul class="space-y-2">
//               <li>
//                  <a href="#" class="flex items-center p-2 text-base font-normal text-gray-900 rounded-lg dark:text-white hover:bg-gray-100 dark:hover:bg-gray-700">
//                   <img class="flex-shrink-0 w-6 h-6 text-gray-500 transition duration-75 dark:text-gray-400 group-hover:text-gray-900 dark:group-hover:text-white" fill="currentColor" viewBox="0 0 20 20" src="./assets/add.png">
//                    <router-link to="/add" ><span class="ml-3">Add Page</span></router-link>
//                  </a>
//               </li> 
//                <li> 
//                  <a href="#" class="flex items-center p-2 text-base font-normal text-gray-900 rounded-lg dark:text-white hover:bg-gray-100 dark:hover:bg-gray-700">
//                     <img class="flex-shrink-0 w-6 h-6 text-gray-500 transition duration-75 dark:text-gray-400 group-hover:text-gray-900 dark:group-hover:text-white" fill="currentColor" viewBox="0 0 20 20" src="./assets/list.png">
//                   <router-link to="/list" ><span class="flex-1 ml-3 whitespace-nowrap">List Page</span></router-link>
//                  </a>
//               </li>
//               <li>
//                  <a href ="#" class="flex items-center p-2 text-base font-normal text-gray-900 rounded-lg dark:text-white hover:bg-gray-100 dark:hover:bg-gray-700">
//                     <img class="flex-shrink-0 w-6 h-6 text-gray-500 transition duration-75 dark:text-gray-400 group-hover:text-gray-900 dark:group-hover:text-white" fill="currentColor" viewBox="0 0 20 20" src="./assets/edit.png">
//                     <router-link to="/edit"> <span class="flex-1 ml-3 whitespace-nowrap">Edit Page</span></router-link>
//                  </a>
//               </li>
//               <li>
//                  <a href="#" class="flex items-center p-2 text-base font-normal text-gray-900 rounded-lg dark:text-white hover:bg-gray-100 dark:hover:bg-gray-700">
//                     <img class="flex-shrink-0 w-6 h-6 text-gray-500 transition duration-75 dark:text-gray-400 group-hover:text-gray-900 dark:group-hover:text-white" fill="currentColor" viewBox="0 0 20 20" src="./assets/delete.png">
//                     <router-link to="/delete"><span class="flex-1 ml-3 whitespace-nowrap">Delete Page</span></router-link>
//                  </a>
//               </li>
//               <li>
//                   <a href="#" class="flex items-center p-2 text-base font-normal text-gray-900 rounded-lg dark:text-white hover:bg-gray-100 dark:hover:bg-gray-700"> 
//                     <img class="flex-shrink-0 w-6 h-6 text-gray-500 transition duration-75 dark:text-gray-400 group-hover:text-gray-900 dark:group-hover:text-white" fill="currentColor" viewBox="0 0 20 20" src="./assets/preview.png">
//                     <router-link to="/preview"><span class="flex-1 ml-3 whitespace-nowrap">Preview Page</span></router-link>
//                   </a>
//               </li>
//            </ul> 
//          </div>
//      </aside> 
// </template>
// <script setup>
// </script>
// <style scoped>
// #app {
//   font-family: Avenir, Helvetica, Arial, sans-serif;
//   -webkit-font-smoothing: antialiased;
//   -moz-osx-font-smoothing: grayscale;
//   color: #185491;
// }
// .m {
//   padding: 0.5em;
// }
// .link{
// border:2px solid blueviolet;
// margin:20px;
// color:darkgreen;
// }
// </style>
<!-- features ============================== -->
<!-- <div class="md:flex py-16 px-10 bg-indigo-800 text-indigo-200 tex
            t-center">
  <div class="mr-2 text-center">
    <img src="https://images.unsplash.com/photo-1586179253019-ac8a2522535f?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1568&q=80" class="w-full mb-4 rounded border-solid border-2 border-indigo-400">
    <p>Cuddles!</p>
  </div>

  <div class="mr-2 mt-8 text-center">
    <img src="https://images.unsplash.com/photo-1453369569379-52cd4fc989af?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1951&q=80" class="w-full mb-4 rounded border-solid border-2 border-indigo-400">
    <p>Smiles!</p>
  </div>

  <div class="mr-2 text-center">
    <img src="https://images.unsplash.com/photo-1543466835-00a7907e9de1?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1567&q=80" class="w-full mb-4 rounded border-solid border-2 border-indigo-400">
    <p>Games!</p>
  </div>

  <div class="mr-2 mt-8 text-center">
    <img src="https://images.unsplash.com/photo-1505623776320-7edecf5f0771?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1950&q=80" class="w-full mb-4 rounded border-solid border-2 border-indigo-400">
    <p>Swims!</p>
  </div>
</div> -->

<!-- footer + newsletter ============================== -->