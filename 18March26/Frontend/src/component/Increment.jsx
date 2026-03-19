import { useState } from "react";
function Increment(){
     const [count,setCount] = useState(0);

  const incrementCounter=()=>{
    setCount(count+1);
  };
  const decrementCounter=()=>{
    setCount(count-1);
  };
  return <>
  <div>
    Total count: {count}
    <br />
    <button onClick={incrementCounter}>
      Add+1
    </button>
    <button onClick={decrementCounter}>
      Subtract-1
    </button>
  </div>
  </>;
}
export default Increment;