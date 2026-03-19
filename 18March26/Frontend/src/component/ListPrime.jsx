import { useState } from "react";

function ListPrime() {
  const numlist = [2, 3, 4, 5, 6, 7, 8, 9, 10, 15];
  
  // We only need one state to hold the final strings we want to display
  const [results, setResults] = useState([]);

  const checkPrime = () => {
    // 1. Create a temporary array to store our findings
    let tempResults = [];

    for (let i = 0; i < numlist.length; i++) {
      let currentNum = numlist[i];
      let isPrime = true; // Assume it's prime until proven otherwise

      if (currentNum <= 1) {
        isPrime = false;
      } else {
        // Standard prime logic: check divisors from 2 up to half the number
        for (let j = 2; j <= currentNum / 2; j++) {
          if (currentNum % j === 0) {
            isPrime = false;
            break; // Stop looking if we found a divisor
          }
        }
      }

      // 2. Build the string using standard concatenation (no $ used)
      if (isPrime) {
        tempResults.push(currentNum + " is a prime number");
      } else {
        tempResults.push(currentNum + " is NOT a prime number");
      }
    }

    // 3. Update the state ONCE with the full array
    setResults(tempResults);
  };

  return (
    <>
      <div style={{ padding: "20px" }}>
        <button onClick={checkPrime}>Check Prime Numbers</button>
        
        <div style={{ marginTop: "20px" }}>
          {results.map((item, index) => (
            /* We use the index as a 'key' so React can track the list items */
            <h4 key={index}>{item}</h4>
          ))}
        </div>
      </div>
    </>
  );
}

export default ListPrime;