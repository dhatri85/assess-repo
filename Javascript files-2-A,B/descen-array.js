const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.question('Enter elements of the array separated by spaces: ', function(input) {
  const unsortedArray = input.split(' ').map(Number);
  
  for (let i = 0; i < unsortedArray.length; i++) {
    for (let j = i + 1; j < unsortedArray.length; j++) {
      if (unsortedArray[i] < unsortedArray[j]) {
        const temp = unsortedArray[i];
        unsortedArray[i] = unsortedArray[j];
        unsortedArray[j] = temp;
      }
    }
  }

  console.log('Sorted array in descending order: ' + unsortedArray.join(' '));
  rl.close();
});