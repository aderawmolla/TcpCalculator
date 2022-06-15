<template>
  <aside class="w-64" aria-label="Sidebar">
        <div class="overflow-y-auto py-4 px-3 bg-gray-50 rounded dark:bg-gray-800">
           <ul class="space-y-2">
              <li>
                 <a href="#" class="flex items-center p-2 text-base font-normal text-gray-900 rounded-lg dark:text-white hover:bg-gray-100 dark:hover:bg-gray-700">
                  <img class="flex-shrink-0 w-6 h-6 text-gray-500 transition duration-75 dark:text-gray-400 group-hover:text-gray-900 dark:group-hover:text-white" fill="currentColor" viewBox="0 0 20 20" src="./assets/add.png">
                   <router-link to="/add" ><span class="ml-3">Add Page</span></router-link>
                 </a>
              </li> 
               <li> 
                 <a href="#" class="flex items-center p-2 text-base font-normal text-gray-900 rounded-lg dark:text-white hover:bg-gray-100 dark:hover:bg-gray-700">
                    <img class="flex-shrink-0 w-6 h-6 text-gray-500 transition duration-75 dark:text-gray-400 group-hover:text-gray-900 dark:group-hover:text-white" fill="currentColor" viewBox="0 0 20 20" src="./assets/list.png">
                  <router-link to="/list" ><span class="flex-1 ml-3 whitespace-nowrap">List Page</span></router-link>
                 </a>
              </li>
              <li>
                 <a href ="#" class="flex items-center p-2 text-base font-normal text-gray-900 rounded-lg dark:text-white hover:bg-gray-100 dark:hover:bg-gray-700">
                    <img class="flex-shrink-0 w-6 h-6 text-gray-500 transition duration-75 dark:text-gray-400 group-hover:text-gray-900 dark:group-hover:text-white" fill="currentColor" viewBox="0 0 20 20" src="./assets/edit.png">
                    <router-link to="/edit"> <span class="flex-1 ml-3 whitespace-nowrap">Edit Page</span></router-link>
                 </a>
              </li>
              <li>
                 <a href="#" class="flex items-center p-2 text-base font-normal text-gray-900 rounded-lg dark:text-white hover:bg-gray-100 dark:hover:bg-gray-700">
                    <img class="flex-shrink-0 w-6 h-6 text-gray-500 transition duration-75 dark:text-gray-400 group-hover:text-gray-900 dark:group-hover:text-white" fill="currentColor" viewBox="0 0 20 20" src="./assets/delete.png">
                    <router-link to="/delete"><span class="flex-1 ml-3 whitespace-nowrap">Delete Page</span></router-link>
                 </a>
              </li>
              <li>
                  <a href="#" class="flex items-center p-2 text-base font-normal text-gray-900 rounded-lg dark:text-white hover:bg-gray-100 dark:hover:bg-gray-700"> 
                    <img class="flex-shrink-0 w-6 h-6 text-gray-500 transition duration-75 dark:text-gray-400 group-hover:text-gray-900 dark:group-hover:text-white" fill="currentColor" viewBox="0 0 20 20" src="./assets/preview.png">
                    <router-link to="/preview"><span class="flex-1 ml-3 whitespace-nowrap">Preview Page</span></router-link>
                  </a>
              </li>
           </ul> 
         </div>
     </aside> 
     <router-view></router-view>
</template>
<script setup>
</script>

