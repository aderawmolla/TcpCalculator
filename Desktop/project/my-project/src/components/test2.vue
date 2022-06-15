<template>
    <div class="navbar">
        <div class="container flex">
            <h1 class="logo">Loruki.</h1>
            <nav>
                <ul>
                    <li><a href="index.html">Home</a></li>
                    <li><a href="features.html">Features</a></li>
                    <li><a href="docs.html">Docs</a></li>
                </ul>
            </nav>
        </div>
    </div>
    
    <!-- Showcase -->
    <section class="showcase">
        <div class="container grid">
            <div class="showcase-text">
                <h1>Easier Deployment</h1>
                <p>Deploy web apps of all kinds, from large scale enterprise APIs to static websites for individuals. Fill out the form to try a demo of our platform</p>
                <a href="features.html" class="btn btn-outline">Read More</a>
            </div>

            <div class="showcase-form card">
                <h2>Request a Demo</h2>
                 <!--  <form name="contact" netlify-honeypot="bot-field" method="POST" data-netlify="true">
                    <input type="hidden" name="form-name" value="contact">
                    <p class="hidden">
                        <label>Don’t fill this out if you're human: <input name="bot-field" /></label>
                      </p>
                    <div class="form-control">
                        <input type="text" name="name" placeholder="Name" required>
                    </div>
                    <div class="form-control">
                        <input type="text" name="company" placeholder="Company Name" required>
                    </div>
                    <div class="form-control">
                        <input type="email" name="email" placeholder="Email" required>
                    </div>
                    <input type="submit" value="Send" class="btn btn-primary">
                </form> -->
                 <form>
                    <div class="form-control">
                        <input type="text" name="name" placeholder="Name" required>
                    </div>
                    <div class="form-control">
                        <input type="text" name="company" placeholder="Company Name" required>
                    </div>
                    <div class="form-control">
                        <input type="email" name="email" placeholder="Email" required>
                    </div>
                    <input type="submit" value="Send" class="btn btn-primary">
                </form>
            </div>
        </div>
    </section>

    <!-- Stats -->
    <section class="stats">
        <div class="container">
            <h3 class="stats-heading text-center my-1">
                Welcome to the best platform for building applications of all types with modern architecture and scaling
            </h3>

            <div class="grid grid-3 text-center my-4">
                <div>
                    <i class="fas fa-server fa-3x"></i>
                    <h3>10,349,405</h3>
                    <p class="text-secondary">Deployments</p>
                </div>
                <div>
                    <i class="fas fa-upload fa-3x"></i>
                    <h3>987 TB</h3>
                    <p class="text-secondary">Published</p>
                </div>
                <div>
                    <i class="fas fa-project-diagram fa-3x"></i>
                    <h3>2,343,265</h3>
                    <p class="text-secondary">Projects</p>
                </div>
            </div>
        </div>
    </section>

    <!-- Cli -->
    <section class="cli">
        <div class="container grid">
            <img src="images/cli.png" alt="">
            <div class="card">
                <h3>Easy to use, cross platform CLI</h3>
            </div>
            <div class="card">
                <h3>Deploy in seconds</h3>
            </div>
        </div>
    </section>

    <!-- Cloud -->
    <section class="cloud bg-primary my-2 py-2">
        <div class="container grid">
            <div class="text-center">
                <h2 class="lg">Extreme Cloud Hosting</h2>
                <p class="lead my-1">Cloud hosting like you've never seen. Fast, efficient and scalable</p>
                <a href="features.html" class="btn btn-dark">Read More</a>
            </div>
            <img src="images/cloud.png" alt="">
        </div>
    </section>

    <!-- Languages -->
    <section class="languages">
        <h2 class="md text-center my-2">
            Supported Languages
        </h2>
        <div class="container flex">
            <div class="card">
                <h4>Node.js</h4>
                <img src="images/logos/node.png" alt="">
            </div>
            <div class="card">
                <h4>Python</h4>
                <img src="images/logos/python.png" alt="">
              </div>
              <div class="card">
                <h4>C#</h4>
                <img src="images/logos/csharp.png" alt="">
              </div>
              <div class="card">
                <h4>Ruby</h4>
                <img src="images/logos/ruby.png" alt="">
              </div>
              <div class="card">
                <h4>PHP</h4>
                <img src="images/logos/php.png" alt="">
              </div>
              <div class="card">
                <h4>Scala</h4>
                <img src="images/logos/scala.png" alt="">
              </div>
              <div class="card">
                <h4>Clojure</h4>
                <img src="images/logos/clojure.png" alt="">
              </div>
        </div>
    </section>

    <!-- Footer -->
    <footer class="footer bg-dark py-5">
        <div class="container grid grid-3">
            <div>
                <h1>Loruki
                </h1>
                <p>Copyright &copy; 2020</p>
            </div>
            <nav>
                <ul>
                    <li><a href="index.html">Home</a></li>
                    <li><a href="features.html">Features</a></li>
                    <li><a href="docs.html">Docs</a></li>
                </ul>
            </nav>
            <div class="social">
                <a href="#"><i class="fab fa-github fa-2x"></i></a>
                <a href="#"><i class="fab fa-facebook fa-2x"></i></a>
                <a href="#"><i class="fab fa-instagram fa-2x"></i></a>
                <a href="#"><i class="fab fa-twitter fa-2x"></i></a>
            </div>
        </div>
    </footer>
    </template>
    <style>
    
    @import url('https://fonts.googleapis.com/css2?family=Lato:wght@300&display=swap');

:root {
  --primary-color: #047aed;
  --secondary-color: #1c3fa8;
  --dark-color: #002240;
  --light-color: #f4f4f4;
  --success-color: #5cb85c;
  --error-color: #d9534f;
}

* {
  box-sizing: border-box;
  padding: 0;
  margin: 0;
}

body {
  font-family: 'Lato', sans-serif;
  color: #333;
  line-height: 1.6;
}

ul {
  list-style-type: none;
}

a {
  text-decoration: none;
  color: #333;
}

h1,
h2 {
  font-weight: 300;
  line-height: 1.2;
  margin: 10px 0;
}

p {
  margin: 10px 0;
}

img {
  width: 100%;
}

code,
pre {
  background: #333;
  color: #fff;
  padding: 10px;
}

.hidden {
  visibility: hidden;
  height: 0;
}

/* Navbar */
.navbar {
  background-color: var(--primary-color);
  color: #fff;
  height: 70px;
}

.navbar ul {
  display: flex;
}

.navbar a {
  color: #fff;
  padding: 10px;
  margin: 0 5px;
}

.navbar a:hover {
  border-bottom: 2px #fff solid;
}

.navbar .flex {
  justify-content: space-between;
}

/* Showcase */
.showcase {
  height: 400px;
  background-color: var(--primary-color);
  color: #fff;
  position: relative;
}

.showcase h1 {
  font-size: 40px;
}

.showcase p {
  margin: 20px 0;
}

.showcase .grid {
  overflow: visible;
  grid-template-columns: 55% auto;
  gap: 30px;
}

.showcase-text {
  animation: slideInFromLeft 1s ease-in;
}

.showcase-form {
  position: relative;
  top: 60px;
  height: 350px;
  width: 400px;
  padding: 40px;
  z-index: 100;
  justify-self: flex-end;
  animation: slideInFromRight 1s ease-in;
}

.showcase-form .form-control {
  margin: 30px 0;
}

.showcase-form input[type='text'],
.showcase-form input[type='email'] {
  border: 0;
  border-bottom: 1px solid #b4becb;
  width: 100%;
  padding: 3px;
  font-size: 16px;
}

.showcase-form input:focus {
  outline: none;
}

.showcase::before,
.showcase::after {
  content: '';
  position: absolute;
  height: 100px;
  bottom: -70px;
  right: 0;
  left: 0;
  background: #fff;
  transform: skewY(-3deg);
  -webkit-transform: skewY(-3deg);
  -moz-transform: skewY(-3deg);
  -ms-transform: skewY(-3deg);
}

/* Stats */
.stats {
  padding-top: 100px;
  animation: slideInFromBottom 1s ease-in;
}

.stats-heading {
  max-width: 500px;
  margin: auto;
}

.stats .grid h3 {
  font-size: 35px;
}

.stats .grid p {
  font-size: 20px;
  font-weight: bold;
}

/* Cli */
.cli .grid {
  grid-template-columns: repeat(3, 1fr);
  grid-template-rows: repeat(2, 1fr);
}

.cli .grid > *:first-child {
  grid-column: 1 / span 2;
  grid-row: 1 / span 2;
}

/* Cloud */
.cloud .grid {
  grid-template-columns: 4fr 3fr;
}

/* Languages */

.languages .flex {
  flex-wrap: wrap;
}

.languages .card {
  text-align: center;
  margin: 18px 10px 40px;
  transition: transform 0.2s ease-in;
}

.languages .card h4 {
  font-size: 20px;
  margin-bottom: 10px;
}

.languages .card:hover {
  transform: translateY(-15px);
}

/* Features */
.features-head img,
.docs-head img {
  width: 200px;
  justify-self: flex-end;
}

.features-sub-head img {
  width: 300px;
  justify-self: flex-end;
}

.features-main .card > i {
  margin-right: 20px;
}

.features-main .grid {
  padding: 30px;
}

.features-main .grid > *:first-child {
  grid-column: 1 / span 3;
}

.features-main .grid > *:nth-child(2) {
  grid-column: 1 / span 2;
}

/* Docs */
.docs-main h3 {
  margin: 20px 0;
}

.docs-main .grid {
  grid-template-columns: 1fr 2fr;
  align-items: flex-start;
}

.docs-main nav li {
  font-size: 17px;
  padding-bottom: 5px;
  margin-bottom: 5px;
  border-bottom: 1px #ccc solid;
}

.docs-main a:hover {
  font-weight: bold;
}

/* Footer */
.footer .social a {
  margin: 0 10px;
}

.fa-github:hover {
  color: #000000;
}

.fa-facebook:hover {
  color: #1773EA;
}

.fa-instagram:hover {
  color: #B32E87;
}

.fa-twitter:hover {
  color: #1C9CEA;
}

/* Animations */
@keyframes slideInFromLeft {
  0% {
    transform: translateX(-100%);
  }

  100% {
    transform: translateX(0);
  }
}

@keyframes slideInFromRight {
  0% {
    transform: translateX(100%);
  }

  100% {
    transform: translateX(0);
  }
}

@keyframes slideInFromTop {
  0% {
    transform: translateY(-100%);
  }

  100% {
    transform: translateX(0);
  }
}

@keyframes slideInFromBottom {
  0% {
    transform: translateY(100%);
  }

  100% {
    transform: translateX(0);
  }
}

/* Tablets and under */
@media (max-width: 768px) {
  .grid,
  .showcase .grid,
  .stats .grid,
  .cli .grid,
  .cloud .grid,
  .features-main .grid,
  .docs-main .grid {
    grid-template-columns: 1fr;
    grid-template-rows: 1fr;
  }

  .showcase {
    height: auto;
  }

  .showcase-text {
    text-align: center;
    margin-top: 40px;
    animation: slideInFromTop 1s ease-in;
  }

  .showcase-form {
    justify-self: center;
    margin: auto;
    animation: slideInFromBottom 1s ease-in;
  }

  .cli .grid > *:first-child {
    grid-column: 1;
    grid-row: 1;
  }

  .features-head,
  .features-sub-head,
  .docs-head {
    text-align: center;
  }

  .features-head img,
  .features-sub-head img,
  .docs-head img {
    justify-self: center;
  }

  .features-main .grid > *:first-child,
  .features-main .grid > *:nth-child(2) {
    grid-column: 1;
  }
}

/* Mobile */
@media (max-width: 500px) {
  .navbar {
    height: 110px;
  }

  .navbar .flex {
    flex-direction: column;
  }

  .navbar ul {
    padding: 10px;
    background-color: rgba(0, 0, 0, 0.1);
  }
  
  .showcase-form {
    width: 300px;
  }
}
    </style>