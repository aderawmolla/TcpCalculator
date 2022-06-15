<script>
import { useQuery } from "@vue/apollo-composable";
import gql from "graphql-tag";
export default {
  setup() {
    const {result} = useQuery(gql`
      query getAllPages {
        getAllPages {
          id
          title
          description
          image_url
        }
      }
    `);
  return{
    result
  }
}
};
</script>
<template>
  <div v-if="error">Something went wrong...</div>
  <div v-if="loading">Loading...</div>
  <div class="flex flex-wrap shadow-lg shadow-green-100 m-2 gap-4">
    <div
      class="m m-2 italic capitalize h-200 bg-white-300 w-200 overflow-x-auto border-8 rounded-lg border-indigo-400"
      v-for="page in result.getAllPages"
      :key="page.id"
    >
<div class="bg-indigo-700 p-4 flex justify-between items-center">

  <!--   left side -->
  <div class="flex items-center">
    <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTbGaj6GyHLdy9tGXt2Rs9Pyrur1dwRZjunRNtJhdrA&s" width="80" height="auto" alt="vue Logo" class="mr-2 bg-green hover:bg-blue">
    <a href="https://hahu.jobs/" class="inline-block p-2 text-indigo-200 hover:text-indigo-100 mr-2">Home</a>
    <a href="https://hahu.jobs/about/" class="inline-block p-2 text-indigo-200 hover:text-indigo-100">About</a>
  </div>

  <!--   right side -->
  <div class="hidden md:block">
    <a href="#" class="inline-block p-2 text-indigo-200 hover:text-indigo-100 mr-2">Login</a>
    <a href="#" class="inline-block py-2 px-4 text-yellow-700 bg-yellow-400 hover:bg-yellow-300 hover:text-yellow-800 rounded transition ease-in duration-150">Sign Up</a>
  </div>

</div>

<!-- hero ============================== -->
<div class="md:flex justify-between py-20 px-10 bg-indigo-600 text-indigo-100">

  <!--   left -->
  <div class="md:w-1/2 mb-10 md:mb-0">
    <h2 class="text-2xl md:text-4xl lg:text-6xl text-white mb-6">Welcome to  {{page.title}} Page!</h2>
    <p class="mb-6">{{page.description}}</p>

    <a href="#" class="inline-block py-3 px-6 text-lg bg-gray-400 text-gray-800 hover:bg-gray-300 rounded mr-2">Learn More</a>
    <a href="#" class="inline-block py-3 px-6 text-lg bg-orange-400 text-orange-800 hover:bg-orange-300 rounded">Get Started</a>
  </div>

  <!--   right -->
  <div class="md:w-1/2">
    <img v-bind:src="page.image_url" alt="It can not display image" class="w-full rounded shadow-2xl">
  </div>

</div>


<div class="p-10 bg-indigo-900 text-indigo-400 flex justify-between">

  <!--   left -->
  <div class="md:w-1/2">

    <h3 class="text-lg mb-2">Join Hahu Jobs</h3>
    <form class="flex">
      <input type="email" class="w-full rounded-l py-3 px-4 outline-none focus:bg-indigo-200">
      <button class="bg-red-300 hover:bg-red-400 text-red-800 rounded-r px-4">Join</button>
    </form>

  </div>

  <!--   right -->
  <div class="flex items-center">
    @Copyright &copy; BahirDar 2022 
  </div>
</div>
     </div>
     </div>
     <router-view> </router-view>

   

  </template>
  
  
  