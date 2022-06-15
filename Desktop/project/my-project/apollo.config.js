// apollo.config.js
module.exports = {
    client: {
      service: {
        name: 'my-app',
      },
      // Files processed by the extension
      includes: [
        'src//*.vue',
        'src//*.js',
      ],
    },
  }