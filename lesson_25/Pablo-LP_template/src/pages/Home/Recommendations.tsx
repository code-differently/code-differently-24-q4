import { Link } from "react-router-dom";

const Recommendations = ()=>{
    return(
        <>
        <h1>Submittion page</h1>
        <input placeholder="please enter a title"/>
        <input placeholder="please enter a description"/>
        <form>
        <button type="submit">
            Submit Your Recommendation
        </button>
        </form>
        <Link to="/">
            <button>
                go back?
            </button>
        </Link>
        </>
    )   
}
export default Recommendations;