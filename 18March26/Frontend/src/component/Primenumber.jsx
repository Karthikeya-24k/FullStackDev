import { useState } from "react";

function Primenumebr(){
    const [num, setNum] = useState(0);
    const [result, setResult] = useState(true);
    const primeFindingApp = () => {
        if(num==0||num==1){
            setResult(false);
        }
        else{
            setResult(true);
            for(let i=2;i<num/2+1;i++){
                if(num%i== 0){
                    setResult(false);
                    break;
                } 
                
            }
        }
        
    };
    return <>
    <div>
        <input type="number" onChange={(e)=>setNum(e.target.value)}placeholder="Enter a number" />
        <button onClick={primeFindingApp}>Submit</button>
        <h1>{result?"Prime number":"Not Prime"}</h1>
    </div>
    </>
}
export default Primenumebr;