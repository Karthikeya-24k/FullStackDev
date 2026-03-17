import { useState } from "react"


function Calc(){
    const [ expression,setExpression] = useState("");
    const [result,setResult] = useState("");
    const calculate = () => {
        try{
            setResult(eval(expression));
        }
        catch{
            setResult("Invalid expression");
        }
    };
    return(
        <>
        <input type="text"
        placeholder="(5+7*2)"
        value={expression}
        onChange={(e)=>setExpression(e.target.value)} />
        <button onSubmit={calculate}>Evaluate</button>
        <h1>Result: {result}</h1>
        </>
    )
}
export default Calc;