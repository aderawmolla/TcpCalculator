<!-- header ==============================  -->
<template>
<div class="bg-indigo-700 p-4 flex justify-between items-center">

  <!--   left side -->
  <div class="flex items-center">
    <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR-jmboBlg94YMZFD4zGwBbe2MLQl6--piEfQRT6ur4ZNXW6J-zOUokuY9fWyBLn3pWsGA&usqp=CAU" width="50" alt="vue Logo" class="mr-2 bg-green hover:bg-blue">
    <a href="#" class="inline-block p-2 text-indigo-200 hover:text-indigo-100 mr-2">Home</a>
    <a href="#" class="inline-block p-2 text-indigo-200 hover:text-indigo-100">About</a>
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
    <h2 class="text-2xl md:text-4xl lg:text-6xl text-white mb-6">Welcome to Doggo City!</h2>
    <p class="mb-6">There is never a sad day here!</p>

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

    <h3 class="text-lg mb-2">Join the Newsletter</h3>
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
</template>
