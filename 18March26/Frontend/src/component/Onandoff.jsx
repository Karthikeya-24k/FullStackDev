import { useState } from "react";

function Onandoff(){
     const [count,setCount] = useState(true);
     const switchFunction = ()=>{
        setCount(!count);
     };
     return(
        <>
        <div>
            {count && <div>
                True</div>}
                {!count && <div>
                False</div>}
                <button onClick={switchFunction}>Update</button>
        </div>
        </>
     );
}
export default Onandoff;