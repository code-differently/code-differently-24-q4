import './CreateProgram.scss';
import React from 'react';

export const CreateProgram: React.FC = () => {
  return (
   <form>
    <label>
        Program Name
        <input type="text" name="name"/>
        </label>
        <label>
            Program Description
                <textarea name="description"/>
        </label>  
        <button type="submit"> Create Program</button>

   </form>
  );
};
