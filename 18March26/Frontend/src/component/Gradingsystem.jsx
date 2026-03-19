import { useState } from "react";

function Gradesystem() {
    // Start marks as an empty string so the input doesn't show '0' by default
    const [marks, setMarks] = useState("");
    const [grade, setGrade] = useState("");

    const calculateGrade = () => {
        // Convert the string input to a real number for comparison
        const score = Number(marks);

        if (marks === "" ) {
            setGrade("Enter Marks");
        }
        if(marks>0&&marks<100){
        if (score >= 90) {
            setGrade("A");
        } else if (score >= 80) {
            setGrade("B");
        } else if (score >= 70) {
            setGrade("C");
        } else if (score >= 60) {
            setGrade("D");
        } else if (score >= 50) {
            setGrade("E"); 
        } else {
            setGrade("F"); 
}
}
         else
            {
            setGrade("Enter a valid marks"
            )
        }

    };

    return (
        <>
            <div>
                <input
                    type="number"
                    placeholder="Enter the marks"
                    value={marks}
                    onChange={(e) => setMarks(e.target.value)}
                />
                {/* Added text inside the button so you can see it */}
                <button onClick={calculateGrade}>Check Grade</button>
                
                <h1>Grade: {grade}</h1>
            </div>
        </>
    );
}

export default Gradesystem;